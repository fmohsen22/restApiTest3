package com.glh.glh.model;import com.fasterxml.jackson.annotation.JsonProperty;import java.util.UUID;public class GlhModel {    private final String word;    public GlhModel( @JsonProperty("word") String word) {        this.word = word;    }    public String getWord() {        return word;    }}