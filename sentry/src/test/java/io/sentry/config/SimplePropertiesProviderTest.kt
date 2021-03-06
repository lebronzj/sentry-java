package io.sentry.config

import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.junit.Test

class SimplePropertiesProviderTest {

    @Test
    fun `when system property is set resolves property`() {
        val properties = Properties()
        properties["some-property"] = "\"some-value\""
        val provider = SimplePropertiesProvider(properties)

        val result = provider.getProperty("some-property")
        assertEquals("some-value", result)
    }

    @Test
    fun `when system property is not set returns null`() {
        val provider = SimplePropertiesProvider(Properties())

        val result = provider.getProperty("some-property")
        assertNull(result)
    }
}
