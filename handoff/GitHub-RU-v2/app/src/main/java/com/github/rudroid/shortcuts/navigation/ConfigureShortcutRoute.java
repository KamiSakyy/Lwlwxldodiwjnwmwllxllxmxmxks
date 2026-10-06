package com.github.rudroid.shortcuts.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.m0;
import g81.e;
import hz.k;
import jo.f4;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import wm.b;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ConfigureShortcutRoute implements Parcelable {
    public b r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConfigureShortcutRoute> CREATOR = new a();
    public static final h[] w = {w.s(i.r, new k(18)), null, null, null, null};

    public static final class Companion {
        public final KSerializer serializer() {
            return ConfigureShortcutRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<ConfigureShortcutRoute> {
        @Override // android.os.Parcelable.Creator
        public final ConfigureShortcutRoute createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            k71.k.g(parcel, "parcel");
            b bVar = (b) parcel.readParcelable(ConfigureShortcutRoute.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new ConfigureShortcutRoute(bVar, z4, z5, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final ConfigureShortcutRoute[] newArray(int i) {
            return new ConfigureShortcutRoute[i];
        }
    }

    public /* synthetic */ ConfigureShortcutRoute(int i, b bVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (30 != (i & 30)) {
            c1.l(i, 30, ConfigureShortcutRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.r = null;
        } else {
            this.r = bVar;
        }
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigureShortcutRoute)) {
            return false;
        }
        ConfigureShortcutRoute configureShortcutRoute = (ConfigureShortcutRoute) obj;
        return k71.k.b(this.r, configureShortcutRoute.r) && this.s == configureShortcutRoute.s && this.t == configureShortcutRoute.t && this.u == configureShortcutRoute.u && this.v == configureShortcutRoute.v;
    }

    public final int hashCode() {
        b bVar = this.r;
        return Boolean.hashCode(this.v) + x.i.e(x.i.e(x.i.e((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.s), 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureShortcutRoute(shortcut=");
        sb.append(this.r);
        sb.append(", isEditing=");
        sb.append(this.s);
        sb.append(", synchronousUpdates=");
        m0.A(sb, this.t, ", useLightweightCreationUi=", this.u, ", isFilterBarVisibleByDefault=");
        return f4.s(sb, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeParcelable(this.r, i);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
    }

    public ConfigureShortcutRoute(b bVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.r = bVar;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = z4;
    }
}
