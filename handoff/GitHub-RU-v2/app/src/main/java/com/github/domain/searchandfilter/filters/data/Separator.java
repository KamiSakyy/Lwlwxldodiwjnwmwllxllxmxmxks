package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import java.util.List;
import k71.k;
import k81.c1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w50.m;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class Separator extends d {
    public final String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Separator> CREATOR = new o(19);
    public static final w61.h[] w = {w.s(w61.i.r, new p(19)), null, null};
    public static final m x = new m(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return Separator$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Separator(int i, l lVar, String str, String str2) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, Separator$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = "separator";
        } else {
            this.v = str2;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Separator) && k.b(this.v, ((Separator) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(q1.a, this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return f1.e.z("Separator(desiredId=", this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v);
    }

    public /* synthetic */ Separator() {
        this("separator");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Separator(String str) {
        super(l.z, str);
        k.g(str, "desiredId");
        this.v = str;
    }
}
