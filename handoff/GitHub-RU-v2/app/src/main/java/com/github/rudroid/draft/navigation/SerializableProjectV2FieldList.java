package com.github.rudroid.draft.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.m0;
import g81.e;
import java.util.ArrayList;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import q01.p;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class SerializableProjectV2FieldList implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f12106r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SerializableProjectV2FieldList> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f12105s = {w.s(i.r, new p(1))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SerializableProjectV2FieldList$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<SerializableProjectV2FieldList> {
        @Override // android.os.Parcelable.Creator
        public final SerializableProjectV2FieldList createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = f1.e.b(SerializableProjectV2FieldList.class, parcel, arrayList, i, 1);
            }
            return new SerializableProjectV2FieldList(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SerializableProjectV2FieldList[] newArray(int i) {
            return new SerializableProjectV2FieldList[i];
        }
    }

    public /* synthetic */ SerializableProjectV2FieldList(int i, ArrayList arrayList) {
        if (1 == (i & 1)) {
            this.f12106r = arrayList;
        } else {
            c1.l(i, 1, SerializableProjectV2FieldList$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof SerializableProjectV2FieldList) && k.b(this.f12106r, ((SerializableProjectV2FieldList) obj).f12106r);
    }

    public final int hashCode() {
        return this.f12106r.hashCode();
    }

    public final String toString() {
        return m0.g("SerializableProjectV2FieldList(items=", ")", this.f12106r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        ArrayList arrayList = this.f12106r;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            parcel.writeParcelable((Parcelable) obj, i);
        }
    }

    public SerializableProjectV2FieldList(ArrayList arrayList) {
        this.f12106r = arrayList;
    }
}
