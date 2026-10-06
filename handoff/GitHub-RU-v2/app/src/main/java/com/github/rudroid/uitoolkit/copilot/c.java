package com.github.rudroid.uitoolkit.copilot;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("CopilotChatSuggestion(heading=", this.a, ", suggestion=", this.b, ")");
    }
}
