package com.github.rudroid.discussions;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class s0 {

    public static final class a extends s0 implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0027a();

        /* renamed from: r, reason: collision with root package name */
        public final String f11782r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f11783s;

        /* renamed from: com.github.rudroid.discussions.s0$a$a, reason: collision with other inner class name */
        public static final class C0027a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(String str, boolean z10) {
            k71.k.g(str, "discussionId");
            this.f11782r = str;
            this.f11783s = z10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f11782r, aVar.f11782r) && this.f11783s == aVar.f11783s;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11783s) + (this.f11782r.hashCode() * 31);
        }

        public final String toString() {
            return com.github.rudroid.copilot.h1.n("DiscussionModified(discussionId=", this.f11782r, ", discussionDeleted=", ")", this.f11783s);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f11782r);
            parcel.writeInt(this.f11783s ? 1 : 0);
        }
    }

    public static final class b extends s0 {

        /* renamed from: r, reason: collision with root package name */
        public static final b f11784r = new b();
    }
}
