package org.intellij.markdown;

import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class MarkdownParsingException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownParsingException(String str) {
        super(str);
        k.g(str, "message");
    }
}
