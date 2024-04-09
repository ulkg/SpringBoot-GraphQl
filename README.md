# Spring Boot Graph QL Demo
Visit http://localhost:8080/graphiql?path=/graphql and start experimenting with GraphQL, e.g. by fetching authors with books via query:

```
query {
  authors {
    id
    name
    books {
      title
    }
  }
}
```

Possibility to define and add custom queries as well:
```
query {
  authorById(id: 2) {
    name
  }
}
```