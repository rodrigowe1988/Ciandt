function Book(title, pages, category) {
	this.title = title;
	this.pages = pages;
	this.category = category;
}

let book1 = new Book('Lord of the Rings', 1200, 'Adventure');

let book2 = new Book();
book2.title = "Harry Potter and the Philosopher's Stone";
book2.pages = 300;
book2.category = 'Phantasy';

Book.prototype.printHello = function() {
	console.log('Hello');
}

console.log(book1);
console.log(book2);
book1.printHello();
