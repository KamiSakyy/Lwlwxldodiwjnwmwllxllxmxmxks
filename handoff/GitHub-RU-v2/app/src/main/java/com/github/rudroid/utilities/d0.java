package com.github.rudroid.utilities;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public final g3.g a;
    public final LinkedHashMap b;

    public d0(g3.g gVar, LinkedHashMap linkedHashMap) {
        this.a = gVar;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a.equals(d0Var.a) && this.b.equals(d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EmojiInlineContent(annotatedText=" + this.a + ", inlineContent=" + this.b + ")";
    }
}
