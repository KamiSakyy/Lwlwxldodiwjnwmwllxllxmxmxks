package com.github.rudroid.projects.triagesheet;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public interface a extends Parcelable {
    String k();

    int p();

    String t();

    /* renamed from: com.github.rudroid.projects.triagesheet.a$a, reason: collision with other inner class name */
    public static final class C0056a implements a {
        public static final Parcelable.Creator<C0056a> CREATOR = new C0057a();

        /* renamed from: r, reason: collision with root package name */
        public int f17983r;

        /* renamed from: s, reason: collision with root package name */
        public String f17984s;

        /* renamed from: t, reason: collision with root package name */
        public String f17985t;

        /* renamed from: com.github.rudroid.projects.triagesheet.a$a$a, reason: collision with other inner class name */
        public static final class C0057a implements Parcelable.Creator<C0056a> {
            @Override // android.os.Parcelable.Creator
            public final C0056a createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new C0056a(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final C0056a[] newArray(int i) {
                return new C0056a[i];
            }
        }

        public C0056a(String str, int i, String str2) {
            k71.k.g(str, "ownerLogin");
            k71.k.g(str2, "repositoryName");
            this.f17983r = i;
            this.f17984s = str;
            this.f17985t = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0056a)) {
                return false;
            }
            C0056a c0056a = (C0056a) obj;
            return this.f17983r == c0056a.f17983r && k71.k.b(this.f17984s, c0056a.f17984s) && k71.k.b(this.f17985t, c0056a.f17985t);
        }

        public final int hashCode() {
            return this.f17985t.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.f17983r) * 31, this.f17984s, 31);
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final String k() {
            return this.f17985t;
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final int p() {
            return this.f17983r;
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final String t() {
            return this.f17984s;
        }

        public final String toString() {
            return com.github.rudroid.copilot.h1.p(x.i.n(this.f17983r, "Organization(emptyPlaceHolder=", ", ownerLogin=", this.f17984s, ", repositoryName="), this.f17985t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(this.f17983r);
            parcel.writeString(this.f17984s);
            parcel.writeString(this.f17985t);
        }

        public /* synthetic */ C0056a(String str, String str2) {
            this(str, 2131954858, str2);
        }
    }

    public static final class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C0058a();

        /* renamed from: r, reason: collision with root package name */
        public int f17986r;

        /* renamed from: s, reason: collision with root package name */
        public String f17987s;

        /* renamed from: t, reason: collision with root package name */
        public String f17988t;

        /* renamed from: com.github.rudroid.projects.triagesheet.a$b$a, reason: collision with other inner class name */
        public static final class C0058a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, int i, String str2) {
            k71.k.g(str, "ownerLogin");
            k71.k.g(str2, "repositoryName");
            this.f17986r = i;
            this.f17987s = str;
            this.f17988t = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17986r == bVar.f17986r && k71.k.b(this.f17987s, bVar.f17987s) && k71.k.b(this.f17988t, bVar.f17988t);
        }

        public final int hashCode() {
            return this.f17988t.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.f17986r) * 31, this.f17987s, 31);
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final String k() {
            return this.f17988t;
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final int p() {
            return this.f17986r;
        }

        @Override // com.github.rudroid.projects.triagesheet.a
        public final String t() {
            return this.f17987s;
        }

        public final String toString() {
            return com.github.rudroid.copilot.h1.p(x.i.n(this.f17986r, "User(emptyPlaceHolder=", ", ownerLogin=", this.f17987s, ", repositoryName="), this.f17988t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(this.f17986r);
            parcel.writeString(this.f17987s);
            parcel.writeString(this.f17988t);
        }

        public /* synthetic */ b(String str, String str2) {
            this(str, 2131954859, str2);
        }
    }
}
