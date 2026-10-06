package com.github.domain.shortcuts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.shortcuts.a;
import g81.e;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l7.c0;
import q01.p;
import sy.w;
import w61.h;
import w61.i;
import wm.b;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutConfigurationModel implements b {
    public static final h[] y;
    public String r;
    public List s;
    public ShortcutColor t;
    public ShortcutIcon u;
    public a v;
    public ShortcutType w;
    public String x;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ShortcutConfigurationModel> CREATOR = new c0(16);

    public static final class Companion {
        public final KSerializer serializer() {
            return ShortcutConfigurationModel$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        y = new h[]{null, null, w.s(iVar, new p(28)), w.s(iVar, new p(29)), w.s(iVar, new wm.a(0)), w.s(iVar, new wm.a(1)), null};
    }

    public /* synthetic */ ShortcutConfigurationModel(int i, String str, List list, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType, String str2) {
        if (126 != (i & 126)) {
            c1.l(i, 126, ShortcutConfigurationModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.r = "";
        } else {
            this.r = str;
        }
        this.s = list;
        this.t = shortcutColor;
        this.u = shortcutIcon;
        this.v = aVar;
        this.w = shortcutType;
        this.x = str2;
    }

    public static ShortcutConfigurationModel c(ShortcutConfigurationModel shortcutConfigurationModel, List list, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType, String str, int i) {
        List list2 = list;
        String str2 = shortcutConfigurationModel.r;
        if ((i & 2) != 0) {
            list2 = shortcutConfigurationModel.s;
        }
        if ((i & 4) != 0) {
            shortcutColor = shortcutConfigurationModel.t;
        }
        if ((i & 8) != 0) {
            shortcutIcon = shortcutConfigurationModel.u;
        }
        if ((i & 16) != 0) {
            aVar = shortcutConfigurationModel.v;
        }
        if ((i & 32) != 0) {
            shortcutType = shortcutConfigurationModel.w;
        }
        if ((i & 64) != 0) {
            str = shortcutConfigurationModel.x;
        }
        String str3 = str;
        shortcutConfigurationModel.getClass();
        k.g(str2, "fullQueryString");
        k.g(list2, "query");
        k.g(shortcutColor, "color");
        k.g(shortcutIcon, "icon");
        k.g(aVar, "scope");
        k.g(shortcutType, "targetType");
        k.g(str3, "name");
        ShortcutType shortcutType2 = shortcutType;
        a aVar2 = aVar;
        ShortcutIcon shortcutIcon2 = shortcutIcon;
        return new ShortcutConfigurationModel(str2, list2, shortcutColor, shortcutIcon2, aVar2, shortcutType2, str3);
    }

    @Override // wm.b
    public final ShortcutType K() {
        return this.w;
    }

    @Override // wm.b
    public final String P() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutConfigurationModel)) {
            return false;
        }
        ShortcutConfigurationModel shortcutConfigurationModel = (ShortcutConfigurationModel) obj;
        return k.b(this.r, shortcutConfigurationModel.r) && k.b(this.s, shortcutConfigurationModel.s) && this.t == shortcutConfigurationModel.t && this.u == shortcutConfigurationModel.u && k.b(this.v, shortcutConfigurationModel.v) && this.w == shortcutConfigurationModel.w && k.b(this.x, shortcutConfigurationModel.x);
    }

    @Override // wm.b
    public final ShortcutColor f() {
        return this.t;
    }

    @Override // wm.b
    public final List g() {
        return this.s;
    }

    @Override // wm.b
    public final ShortcutIcon getIcon() {
        return this.u;
    }

    @Override // wm.b
    public final String getName() {
        return this.x;
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + f1.e.c(this.s, this.r.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // wm.b
    public final a i() {
        return this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutConfigurationModel(fullQueryString=");
        sb.append(this.r);
        sb.append(", query=");
        sb.append(this.s);
        sb.append(", color=");
        sb.append(this.t);
        sb.append(", icon=");
        sb.append(this.u);
        sb.append(", scope=");
        sb.append(this.v);
        sb.append(", targetType=");
        sb.append(this.w);
        sb.append(", name=");
        return h1.p(sb, this.x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        Iterator q = f1.e.q(this.s, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
        parcel.writeString(this.t.name());
        parcel.writeString(this.u.name());
        parcel.writeParcelable(this.v, i);
        parcel.writeString(this.w.name());
        parcel.writeString(this.x);
    }

    public ShortcutConfigurationModel(String str, List list, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType, String str2) {
        k.g(str, "fullQueryString");
        k.g(list, "query");
        k.g(shortcutColor, "color");
        k.g(shortcutIcon, "icon");
        k.g(aVar, "scope");
        k.g(shortcutType, "targetType");
        k.g(str2, "name");
        this.r = str;
        this.s = list;
        this.t = shortcutColor;
        this.u = shortcutIcon;
        this.v = aVar;
        this.w = shortcutType;
        this.x = str2;
    }

    public /* synthetic */ ShortcutConfigurationModel(List list, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType, String str) {
        this("", list, shortcutColor, shortcutIcon, aVar, shortcutType, str);
    }
}
