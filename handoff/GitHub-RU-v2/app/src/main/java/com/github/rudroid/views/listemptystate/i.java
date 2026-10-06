package com.github.rudroid.views.listemptystate;

import a0.s0;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.github.rudroid.widget.p;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements a {
    public String a;
    public String b;
    public Drawable c;
    public Integer d;
    public j71.a e;

    public i(String str, String str2, BitmapDrawable bitmapDrawable, Integer num, j71.a aVar) {
        k.g(str, "title");
        k.g(aVar, "buttonAction");
        this.a = str;
        this.b = str2;
        this.c = bitmapDrawable;
        this.d = num;
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.b(this.a, iVar.a) && k.b(this.b, iVar.b) && k.b(this.c, iVar.c) && k.b(this.d, iVar.d) && k.b(this.e, iVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.c;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ValueEmptyUiModel(title=", this.a, ", description=", this.b, ", imageDrawable=");
        o.append(this.c);
        o.append(", buttonTextResId=");
        o.append(this.d);
        o.append(", buttonAction=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }

    public /* synthetic */ i(String str, BitmapDrawable bitmapDrawable) {
        this(str, null, bitmapDrawable, null, new p(15));
    }
}
