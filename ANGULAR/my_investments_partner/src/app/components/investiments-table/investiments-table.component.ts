import { Component, OnInit } from '@angular/core';

import { Conta } from 'src/app/Conta';
import { NomeDasContas } from 'src/app/NomeDasContas';

import { TableService } from 'src/app/services/table.service';

@Component({
  selector: 'app-investiments-table',
  templateUrl: './investiments-table.component.html',
  styleUrls: ['./investiments-table.component.css']
})
export class InvestimentsTableComponent implements OnInit {

  nomeDasContas: NomeDasContas [] = [
  {
    data: "Data",
    rico: "Rico",
    modal: "Modal",
    clear: "Clear",
    sicredi: "Sicredi",
    santander: "Santander",
    bradesco: "Bradesco",
    nubank: "Nubank",
  }
  ];

  contas: Conta[] = [];

  total: number = 0;
  diaAnalisado = '';

  constructor(private tableService: TableService) {
    this.getInvestments();
  }

  ngOnInit(): void {
  }

  totalSomar(conta: Conta) {
    this.total = Math.round(conta.rico + conta.modal + conta.clear + conta.sicredi + conta.bradesco + conta.santander + conta.nubank);
    this.diaAnalisado = conta.data;
  }

  removeInvestment(conta: Conta) {
    this.contas = this.contas.filter((a) => conta.data !== a.data);
    this.tableService.remove(conta.data).subscribe();
  }

  getInvestments(): void {
    this.tableService.getAll().subscribe((contas) => (this.contas = contas));
  }
}
