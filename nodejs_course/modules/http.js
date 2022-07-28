const http = require("http");

const port = 8080;

const server = http.createServer((req, res) => {
  if (req.url == "/home") {
    res.writeHead(200, { "Content-type": "text/html" });
    res.end("<h1>home page</h1>");
  }

  if (req.url == "/users") {
    const users = [
      {
        name: "Jonh Doe",
        email: "john@doe.com",
      },
      {
        name: "Jane Doe",
        email: "jane@doe.com",
      },
    ];
    res.writeHeayo.stringify(users);
  }
});

server.listen(port, () => console.log(`Server running at the port ${port}`));
