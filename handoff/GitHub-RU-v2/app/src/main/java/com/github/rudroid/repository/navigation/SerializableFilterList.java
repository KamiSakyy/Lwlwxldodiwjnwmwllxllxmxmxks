package com.github.rudroid.repository.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.m0;
import g81.e;
import java.util.ArrayList;
import k71.k;
import kotlinx.serialization.KSerializer;
import q01.p;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class SerializableFilterList implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f20040r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SerializableFilterList> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f20039s = {w.s(i.r, new p(5))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SerializableFilterList$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<SerializableFilterList> {
        @Override // android.os.Parcelable.Creator
        public final SerializableFilterList createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = f1.e.b(SerializableFilterList.class, parcel, arrayList, i, 1);
            }
            return new SerializableFilterList(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SerializableFilterList[] newArray(int i) {
            return new SerializableFilterList[i];
        }
    }

    public /* synthetic */ SerializableFilterList(int i, ArrayList arrayList) {
        if ((i & 1) == 0) {
            this.f20040r = new ArrayList();
        } else {
            this.f20040r = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SerializableFilterList) && k.b(this.f20040r, ((SerializableFilterList) obj).f20040r);
    }

    public final int hashCode() {
        return this.f20040r.hashCode();
    }

    public final String toString() {
        return m0.g("SerializableFilterList(filters=", ")", this.f20040r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        ArrayList arrayList = this.f20040r;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            parcel.writeParcelable((Parcelable) obj, i);
        }
    }

    public SerializableFilterList(ArrayList arrayList) {
        k.g(arrayList, "filters");
        this.f20040r = arrayList;
    }

    public /* synthetic */ SerializableFilterList() {
        this(new ArrayList());
    }
}
