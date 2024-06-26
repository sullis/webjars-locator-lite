package org.webjars;


import org.jspecify.annotations.NullMarked;

import java.util.Optional;
import java.util.function.Function;

/**
 * WebJar Locator Cache Interface
 * Since classpath resources are essentially immutable, the WebJarsCache does not have the concept of expiry.
 * Cache keys and values are Strings because that is all that is needed.
 */
@NullMarked
interface WebJarCache {

    Optional<String> computeIfAbsent(String key, Function<String, Optional<String>> function);

}
