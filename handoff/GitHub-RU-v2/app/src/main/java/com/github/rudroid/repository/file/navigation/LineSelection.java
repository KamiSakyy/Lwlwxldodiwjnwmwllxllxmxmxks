package com.github.rudroid.repository.file.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import jo.f4;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class LineSelection implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public int f19431r;

    /* renamed from: s, reason: collision with root package name */
    public int f19432s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LineSelection> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return LineSelection$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<LineSelection> {
        @Override // android.os.Parcelable.Creator
        public final LineSelection createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new LineSelection(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LineSelection[] newArray(int i) {
            return new LineSelection[i];
        }
    }

    public LineSelection(int i, int i10) {
        this.f19431r = i;
        this.f19432s = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelection)) {
            return false;
        }
        LineSelection lineSelection = (LineSelection) obj;
        return this.f19431r == lineSelection.f19431r && this.f19432s == lineSelection.f19432s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19432s) + (Integer.hashCode(this.f19431r) * 31);
    }

    public final String toString() {
        return f4.h(this.f19431r, this.f19432s, "LineSelection(start=", ", end=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.f19431r);
        parcel.writeInt(this.f19432s);
    }

    public /* synthetic */ LineSelection(int i, int i10, int i11) {
        if (3 != (i & 3)) {
            c1.l(i, 3, LineSelection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19431r = i10;
        this.f19432s = i11;
    }
}
