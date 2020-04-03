/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sahli.asciidoc.confluence.publisher.converter;

import java.util.Optional;

/**
 * @author Christian Stettler
 */
public class PrefixAndSuffixPageTitlePostProcessor implements PageTitlePostProcessor {

	private final Optional<String> prefix;
	private final Optional<String> suffix;

	public PrefixAndSuffixPageTitlePostProcessor(String prefix, String suffix) {
		this.prefix = Optional.ofNullable(prefix);
		this.suffix = Optional.ofNullable(suffix);
	}

	@Override
	public String process(String pageTitle) {
		return this.prefix.orElse("")
				.concat(pageTitle)
				.concat(this.suffix.orElse(""));
	}

}
