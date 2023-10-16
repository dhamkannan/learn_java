DB_URL=postgresql://root:secret@localhost:5432/cloud_vendor?sslmode=disable

postgres:
	docker run --name postgres -p 5432:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=secret -d postgres:12-alpine

createdb:
	docker exec -it postgres createdb --username=root --owner=root cloud_vendor

dropdb:
	docker exec -it postgres dropdb cloud_vendor

.PHONY: postgres createdb dropdb