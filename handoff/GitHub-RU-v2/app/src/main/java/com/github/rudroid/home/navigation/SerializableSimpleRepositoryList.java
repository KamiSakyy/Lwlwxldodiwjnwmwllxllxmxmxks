package com.github.rudroid.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.m0;
import g81.e;
import hz.k;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class SerializableSimpleRepositoryList implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f15003r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SerializableSimpleRepositoryList> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f15002s = {w.s(i.r, new k(16))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SerializableSimpleRepositoryList$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<SerializableSimpleRepositoryList> {
        @Override // android.os.Parcelable.Creator
        public final SerializableSimpleRepositoryList createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = f1.e.b(SerializableSimpleRepositoryList.class, parcel, arrayList, i, 1);
            }
            return new SerializableSimpleRepositoryList(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SerializableSimpleRepositoryList[] newArray(int i) {
            return new SerializableSimpleRepositoryList[i];
        }
    }

    public /* synthetic */ SerializableSimpleRepositoryList(int i, ArrayList arrayList) {
        if ((i & 1) == 0) {
            this.f15003r = new ArrayList();
        } else {
            this.f15003r = arrayList;
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
        return (obj instanceof SerializableSimpleRepositoryList) && k71.k.b(this.f15003r, ((SerializableSimpleRepositoryList) obj).f15003r);
    }

    public final int hashCode() {
        return this.f15003r.hashCode();
    }

    public final String toString() {
        return m0.g("SerializableSimpleRepositoryList(repositories=", ")", this.f15003r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        ArrayList arrayList = this.f15003r;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            parcel.writeParcelable((Parcelable) obj, i);
        }
    }

    public SerializableSimpleRepositoryList(ArrayList arrayList) {
        this.f15003r = arrayList;
    }
}
