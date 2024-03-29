const ctx = document.getElementById('myChart').getContext('2d');

//Gradient Fill
let gradient = ctx.createLinearGradient(0, 0, 0, 400);
gradient.addColorStop(0, 'rgb(58, 123, 213, 1)');
gradient.addColorStop(1, 'rgb(0 , 210, 255, 0.3)');

const labels = [
	"06/03/2022",
	"29/03/2022",
	"07/04/2022",
	"17/04/2022",
	"01/05/2022",
	"08/05/2022",
	"15/05/2022",
	"29/05/2022",
	"09/06/2022",
	'31/07/2022',
	'11/08/2022'
];

const data = {
	labels,
	datasets: [{
		data: [
			198934.07, 200446.81, 206258.76, 206684.85, 203544.56, 206553.98, 208273.01, 209624.01, 212327.01, 217194.01, 225701
		],
		borderColor: 'rgb(58, 123, 213, 1)',
		//label: ,
		pointBackgroundColor: '#fff',
		//fill: true,
		//backgroundColor: gradient,
	}]
}

const config = {
	type: 'line',
	data: data,
   tension: 0.1,
	options: {
		radius: 5,
		hitRadius: 40,
		responsive: true,
		scales: {
			y: {
				grid: {
					display: false
				},
				ticks: {
					callback: function (value) {
						return `R$ ${value}`
					}
				}
			},
			x: {
				grid: {
					display: false
				}
			}
		}
	},

}

const myChart = new Chart(ctx, config);
