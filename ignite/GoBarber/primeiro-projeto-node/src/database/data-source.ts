import { DataSource } from "typeorm"

	export const AppDataSource = new DataSource({
		 type: "postgres",
		 host: "localhost",
		 port: 5433,
		 username: "postgres",
		 password: "docker",
		 database: "gostack_gobarber",
		 migrations: [
			"./src/database/migrations/*.ts"
		 ],

	})

	AppDataSource.initialize()
		 .then(() => {
			  console.log("Data Source has been initialized!")
		 })
		 .catch((err) => {
			  console.error("Error during Data Source initialization", err)
		 })
