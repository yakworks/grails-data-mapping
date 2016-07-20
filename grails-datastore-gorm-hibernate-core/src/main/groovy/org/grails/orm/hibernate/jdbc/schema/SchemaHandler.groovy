package org.grails.orm.hibernate.jdbc.schema

import javax.sql.DataSource
import java.sql.Connection

/**
 * A resolver that helps resolve information about the database schema. Required by multi tenancy support
 *
 * @author Graeme Rocher
 * @since 6.0
 */
interface SchemaHandler {

    /**
     * @return Resolves the schema names
     */
    Collection<String> resolveSchemaNames(DataSource dataSource)

    /**
     * Uses the given schema. Defaults to "SET SCHEMA {0}"
     */
    void useSchema(Connection connection, String name)

    /**
     * Uses the given schema. Defaults to "SET SCHEMA PUBLIC"
     */
    void useDefaultSchema(Connection connection)

    /**
     * Creates the given schema. Defaults to "CREATE SCHEMA {0}"
     */
    void createSchema(Connection connection, String name)
}