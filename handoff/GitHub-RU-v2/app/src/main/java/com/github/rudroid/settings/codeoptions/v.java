package com.github.rudroid.settings.codeoptions;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements f {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public v(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final boolean a() {
        return this.f;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final boolean b() {
        return this.b;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final boolean c() {
        return this.a;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final boolean d() {
        return this.e;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c && this.d == vVar.d && this.e == vVar.e && this.f == vVar.f;
    }

    @Override // com.github.rudroid.settings.codeoptions.f
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + x.i.e(x.i.e(s0.b(this.c, x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = h1.u("CodeOptionsPref(showLineNumbers=", this.a, ", usingCustomTextSize=", this.b, ", codeTextSelectedIndex=");
        m0.w(u, this.c, ", isForceDarkTheme=", this.d, ", isLineWrappingEnabled=");
        return m0.m(u, this.e, ", isFilePathScrollable=", this.f, ")");
    }
}
