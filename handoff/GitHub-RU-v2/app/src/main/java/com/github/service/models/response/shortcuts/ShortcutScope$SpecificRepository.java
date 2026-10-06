package com.github.service.models.response.shortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l7.c0;
import x.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ShortcutScope$SpecificRepository extends a {
    public String s;
    public String t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ShortcutScope$SpecificRepository> CREATOR = new c0(9);

    public static final class Companion {
        public final KSerializer serializer() {
            return ShortcutScope$SpecificRepository$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShortcutScope$SpecificRepository(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, ShortcutScope$SpecificRepository$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.s = str;
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutScope$SpecificRepository)) {
            return false;
        }
        ShortcutScope$SpecificRepository shortcutScope$SpecificRepository = (ShortcutScope$SpecificRepository) obj;
        return k.b(this.s, shortcutScope$SpecificRepository.s) && k.b(this.t, shortcutScope$SpecificRepository.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + (this.s.hashCode() * 31);
    }

    public final String toString() {
        return i.g("SpecificRepository(owner=", this.s, ", name=", this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public ShortcutScope$SpecificRepository(String str, String str2) {
        k.g(str, "owner");
        k.g(str2, "name");
        this.s = str;
        this.t = str2;
    }
}
