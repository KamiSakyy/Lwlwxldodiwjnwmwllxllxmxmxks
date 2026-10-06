package com.github.rudroid.repositorycreation.gitignore;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f20346a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20347b;

    public b(String str, boolean z10) {
        k71.k.g(str, "name");
        this.f20346a = str;
        this.f20347b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f20346a, bVar.f20346a) && this.f20347b == bVar.f20347b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20347b) + (this.f20346a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("GitignoreTemplateItem(name=", this.f20346a, ", isSelected=", ")", this.f20347b);
    }
}
