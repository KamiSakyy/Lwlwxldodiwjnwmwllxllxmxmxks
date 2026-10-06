package com.github.rudroid.repositorycreation.gitignore;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final r f20371d = new r(g1.a.c(g1.Companion), "", null);

    /* renamed from: a, reason: collision with root package name */
    public g1 f20372a;

    /* renamed from: b, reason: collision with root package name */
    public String f20373b;

    /* renamed from: c, reason: collision with root package name */
    public String f20374c;

    public static final class a {
    }

    public r(g1 g1Var, String str, String str2) {
        k71.k.g(str, "searchQuery");
        this.f20372a = g1Var;
        this.f20373b = str;
        this.f20374c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.f20372a, rVar.f20372a) && k71.k.b(this.f20373b, rVar.f20373b) && k71.k.b(this.f20374c, rVar.f20374c);
    }

    public final int hashCode() {
        int i = h1.i(this.f20372a.hashCode() * 31, this.f20373b, 31);
        String str = this.f20374c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GitignoreTemplatePickerUiModel(templatesState=");
        sb2.append(this.f20372a);
        sb2.append(", searchQuery=");
        sb2.append(this.f20373b);
        sb2.append(", selectedTemplate=");
        return h1.p(sb2, this.f20374c, ")");
    }
}
