// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSetter;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

import java.util.Arrays;
import java.util.List;

/**
 * Tokenizes the input into n-grams of the given size(s). This tokenizer is
 * implemented using Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type")
@SerdeTypeName("#Microsoft.Azure.Search.NGramTokenizer")
@Fluent
public final class NGramTokenizer extends LexicalTokenizer {
    /*
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less
     * than the value of maxGram.
     */
    @SerdeProperty(value = "minGram")
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    @SerdeProperty(value = "maxGram")
    private Integer maxGram;

    /*
     * Character classes to keep in the tokens.
     */
    @SerdeProperty(value = "tokenChars")
    private List<TokenCharacterKind> tokenChars;

    /**
     * Constructor of {@link NGramTokenizer}.
     *
     * @param name The name of the tokenizer. It must only contain letters, digits, spaces,
     * dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    public NGramTokenizer(String name) {
        super(name);
    }

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1.
     * Maximum is 300. Must be less than the value of maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1.
     * Maximum is 300. Must be less than the value of maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2.
     * Maximum is 300.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2.
     * Maximum is 300.
     *
     * @param maxGram the maxGram value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get the tokenChars property: Character classes to keep in the tokens.
     *
     * @return the tokenChars value.
     */
    public List<TokenCharacterKind> getTokenChars() {
        return this.tokenChars;
    }

    /**
     * Set the tokenChars property: Character classes to keep in the tokens.
     *
     * @param tokenChars the tokenChars value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setTokenChars(TokenCharacterKind... tokenChars) {
        this.tokenChars = (tokenChars == null) ? null : Arrays.asList(tokenChars);
        return this;
    }

    /**
     * Set the tokenChars property: Character classes to keep in the tokens.
     *
     * @param tokenChars the tokenChars value to set.
     * @return the NGramTokenizer object itself.
     */
    @SerdeSetter
    public NGramTokenizer setTokenChars(List<TokenCharacterKind> tokenChars) {
        this.tokenChars = tokenChars;
        return this;
    }
}