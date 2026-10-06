package com.github.domain.shortcuts.model;

import a0.s0;
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
import sy.w;
import w61.h;
import w61.i;
import wm.b;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class StoredShortcutModel implements b {
    public static final h[] z;
    public String r;
    public String s;
    public String t;
    public List u;
    public ShortcutColor v;
    public ShortcutIcon w;
    public a x;
    public ShortcutType y;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<StoredShortcutModel> CREATOR = new c0(17);

    public static final class Companion {
        public final KSerializer serializer() {
            return StoredShortcutModel$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        z = new h[]{null, null, null, null, w.s(iVar, new wm.a(2)), w.s(iVar, new wm.a(3)), w.s(iVar, new wm.a(4)), w.s(iVar, new wm.a(5))};
    }

    public /* synthetic */ StoredShortcutModel(int i, String str, String str2, String str3, List list, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType) {
        if (255 != (i & 255)) {
            c1.l(i, 255, StoredShortcutModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = list;
        this.v = shortcutColor;
        this.w = shortcutIcon;
        this.x = aVar;
        this.y = shortcutType;
    }

    @Override // wm.b
    public final ShortcutType K() {
        return this.y;
    }

    @Override // wm.b
    public final String P() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredShortcutModel)) {
            return false;
        }
        StoredShortcutModel storedShortcutModel = (StoredShortcutModel) obj;
        return k.b(this.r, storedShortcutModel.r) && k.b(this.s, storedShortcutModel.s) && k.b(this.t, storedShortcutModel.t) && k.b(this.u, storedShortcutModel.u) && this.v == storedShortcutModel.v && this.w == storedShortcutModel.w && k.b(this.x, storedShortcutModel.x) && this.y == storedShortcutModel.y;
    }

    @Override // wm.b
    public final ShortcutColor f() {
        return this.v;
    }

    @Override // wm.b
    public final List g() {
        return this.u;
    }

    @Override // wm.b
    public final ShortcutIcon getIcon() {
        return this.w;
    }

    @Override // wm.b
    public final String getName() {
        return this.t;
    }

    public final int hashCode() {
        return this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + f1.e.c(this.u, h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31)) * 31)) * 31)) * 31);
    }

    @Override // wm.b
    public final a i() {
        return this.x;
    }

    public final String toString() {
        StringBuilder o = s0.o("StoredShortcutModel(id=", this.r, ", fullQueryString=", this.s, ", name=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(", color=");
        o.append(this.v);
        o.append(", icon=");
        o.append(this.w);
        o.append(", scope=");
        o.append(this.x);
        o.append(", targetType=");
        o.append(this.y);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        Iterator q = f1.e.q(this.u, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
        parcel.writeString(this.v.name());
        parcel.writeString(this.w.name());
        parcel.writeParcelable(this.x, i);
        parcel.writeString(this.y.name());
    }

    public StoredShortcutModel(ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, a aVar, ShortcutType shortcutType, String str, String str2, String str3, List list) {
        k.g(str, "id");
        k.g(str2, "fullQueryString");
        k.g(str3, "name");
        k.g(list, "query");
        k.g(shortcutColor, "color");
        k.g(shortcutIcon, "icon");
        k.g(aVar, "scope");
        k.g(shortcutType, "targetType");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = list;
        this.v = shortcutColor;
        this.w = shortcutIcon;
        this.x = aVar;
        this.y = shortcutType;
    }
}
