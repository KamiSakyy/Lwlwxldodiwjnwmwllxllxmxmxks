package com.github.rudroid.views.listemptystate;

import com.github.rudroid.widget.p;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements a {
    public int a;
    public Integer b;
    public Integer c;
    public Integer d;
    public j71.a e;

    public h(int i, Integer num, Integer num2, Integer num3, j71.a aVar) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = aVar;
    }

    @Override // com.github.rudroid.views.listemptystate.a
    public final Integer a() {
        return this.d;
    }

    @Override // com.github.rudroid.views.listemptystate.a
    public final j71.a b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && k.b(this.b, hVar.b) && k.b(this.c, hVar.c) && k.b(this.d, hVar.d) && k.b(this.e, hVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ResEmptyUiModel(title=" + this.a + ", description=" + this.b + ", imageDrawable=" + this.c + ", buttonTextResId=" + this.d + ", buttonAction=" + this.e + ")";
    }

    public /* synthetic */ h(int i, int i2, Integer num) {
        this(i, (i2 & 2) != 0 ? null : num, null, null, new p(15));
    }
}
