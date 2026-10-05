package com.github.rudroid.fileschanged.ui;

import a0.s0;
import com.github.service.models.response.type.DiffLineType;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f13545a;

    /* renamed from: b, reason: collision with root package name */
    public final DiffLineType f13546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13547c;

    public m(int i, DiffLineType diffLineType, String str) {
        k71.k.g(str, "content");
        k71.k.g(diffLineType, "type");
        this.f13545a = str;
        this.f13546b = diffLineType;
        this.f13547c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.f13545a, mVar.f13545a) && this.f13546b == mVar.f13546b && this.f13547c == mVar.f13547c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13547c) + ((this.f13546b.hashCode() + (this.f13545a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposeDiffLine(content=");
        sb2.append(this.f13545a);
        sb2.append(", type=");
        sb2.append(this.f13546b);
        sb2.append(", lineNumber=");
        return s0.l(sb2, this.f13547c, ")");
    }
}
