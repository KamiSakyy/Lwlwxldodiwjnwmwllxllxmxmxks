package com.github.rudroid.copilot.preferences;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f9963a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9964b;

    public f(String str, boolean z10) {
        this.f9963a = str;
        this.f9964b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.f9963a, fVar.f9963a) && this.f9964b == fVar.f9964b;
    }

    public final int hashCode() {
        String str = this.f9963a;
        return Boolean.hashCode(this.f9964b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return h1.n("CopilotChatPreferences(lastActiveThreadId=", this.f9963a, ", isCopilotEnabledByUser=", ")", this.f9964b);
    }
}
