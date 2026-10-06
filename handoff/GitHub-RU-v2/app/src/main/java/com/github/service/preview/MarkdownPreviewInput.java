package com.github.service.preview;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import t01.a;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class MarkdownPreviewInput {
    public static final Companion Companion = new Companion();
    public String a;
    public String b;
    public String c;

    public static final class Companion {
        public final KSerializer serializer() {
            return MarkdownPreviewInput$$serializer.INSTANCE;
        }
    }

    public MarkdownPreviewInput(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            a[] aVarArr = a.r;
            this.b = "gfm";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkdownPreviewInput)) {
            return false;
        }
        MarkdownPreviewInput markdownPreviewInput = (MarkdownPreviewInput) obj;
        return k.b(this.a, markdownPreviewInput.a) && k.b(this.b, markdownPreviewInput.b) && k.b(this.c, markdownPreviewInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("MarkdownPreviewInput(text=", this.a, ", mode=", this.b, ", context="), this.c, ")");
    }

    public MarkdownPreviewInput(String str, String str2) {
        a[] aVarArr = a.r;
        k.g(str, "text");
        k.g(str2, "context");
        this.a = str;
        this.b = "gfm";
        this.c = str2;
    }
}
