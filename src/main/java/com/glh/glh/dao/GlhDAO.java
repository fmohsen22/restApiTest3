package com.glh.glh.dao;import com.glh.glh.model.GlhModel;import com.sentence.elements.Nomens;import com.sentence.elements.Verbs;import com.sentence.elements.Words;import java.util.List;import java.util.Optional;import java.util.Random;import java.util.UUID;public interface GlhDAO {    String insertWord( GlhModel glhModel);    Nomens selectWordElements();    Verbs selectVerbElements();    Words showWordElements();}