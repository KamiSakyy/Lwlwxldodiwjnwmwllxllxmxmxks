package com.github.rudroid.repository.files;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b implements Parcelable {

    public static final class a extends b {

        /* renamed from: r, reason: collision with root package name */
        public static final a f19534r = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0061a();

        /* renamed from: com.github.rudroid.repository.files.b$a$a, reason: collision with other inner class name */
        public static final class C0061a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return a.f19534r;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 378505069;
        }

        public final String toString() {
            return "Browsing";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    /* renamed from: com.github.rudroid.repository.files.b$b, reason: collision with other inner class name */
    public static final class C0062b extends b {
        public static final Parcelable.Creator<C0062b> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public final String f19535r;

        /* renamed from: s, reason: collision with root package name */
        public final String f19536s;

        /* renamed from: com.github.rudroid.repository.files.b$b$a */
        public static final class a implements Parcelable.Creator<C0062b> {
            @Override // android.os.Parcelable.Creator
            public final C0062b createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new C0062b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final C0062b[] newArray(int i) {
                return new C0062b[i];
            }
        }

        public C0062b(String str, String str2) {
            k71.k.g(str, "baseBranch");
            k71.k.g(str2, "headBranch");
            this.f19535r = str;
            this.f19536s = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0062b)) {
                return false;
            }
            C0062b c0062b = (C0062b) obj;
            return k71.k.b(this.f19535r, c0062b.f19535r) && k71.k.b(this.f19536s, c0062b.f19536s);
        }

        public final int hashCode() {
            return this.f19536s.hashCode() + (this.f19535r.hashCode() * 31);
        }

        public final String toString() {
            return x.i.g("Comparison(baseBranch=", this.f19535r, ", headBranch=", this.f19536s, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f19535r);
            parcel.writeString(this.f19536s);
        }
    }
}
