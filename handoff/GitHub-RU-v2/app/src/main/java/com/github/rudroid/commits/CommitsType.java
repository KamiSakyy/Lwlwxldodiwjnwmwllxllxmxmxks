package com.github.rudroid.commits;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import k81.c1;
import kotlinx.serialization.KSerializer;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public abstract class CommitsType implements Parcelable {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f9154r = sy.w.s(w61.i.r, new com.github.rudroid.agents.p(27));

    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) CommitsType.f9154r.getValue();
        }
    }

    @g81.e
    public static final class Commits extends CommitsType {

        /* renamed from: s, reason: collision with root package name */
        public final String f9155s;

        /* renamed from: t, reason: collision with root package name */
        public final String f9156t;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Commits> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitsType$Commits$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<Commits> {
            @Override // android.os.Parcelable.Creator
            public final Commits createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new Commits(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Commits[] newArray(int i) {
                return new Commits[i];
            }
        }

        public /* synthetic */ Commits(String str, int i, String str2) {
            if (1 != (i & 1)) {
                c1.l(i, 1, CommitsType$Commits$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f9155s = str;
            if ((i & 2) == 0) {
                this.f9156t = null;
            } else {
                this.f9156t = str2;
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
            if (!(obj instanceof Commits)) {
                return false;
            }
            Commits commits = (Commits) obj;
            return k71.k.b(this.f9155s, commits.f9155s) && k71.k.b(this.f9156t, commits.f9156t);
        }

        public final int hashCode() {
            int hashCode = this.f9155s.hashCode() * 31;
            String str = this.f9156t;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return x.i.g("Commits(pullId=", this.f9155s, ", headRefName=", this.f9156t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9155s);
            parcel.writeString(this.f9156t);
        }

        public Commits(String str, String str2) {
            k71.k.g(str, "pullId");
            this.f9155s = str;
            this.f9156t = str2;
        }
    }

    @g81.e
    public static final class Deeplink extends CommitsType {

        /* renamed from: s, reason: collision with root package name */
        public final String f9157s;

        /* renamed from: t, reason: collision with root package name */
        public final String f9158t;

        /* renamed from: u, reason: collision with root package name */
        public final int f9159u;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitsType$Deeplink$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<Deeplink> {
            @Override // android.os.Parcelable.Creator
            public final Deeplink createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new Deeplink(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Deeplink[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public /* synthetic */ Deeplink(int i, int i10, String str, String str2) {
            if (7 != (i & 7)) {
                c1.l(i, 7, CommitsType$Deeplink$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f9157s = str;
            this.f9158t = str2;
            this.f9159u = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj;
            return k71.k.b(this.f9157s, deeplink.f9157s) && k71.k.b(this.f9158t, deeplink.f9158t) && this.f9159u == deeplink.f9159u;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9159u) + h1.i(this.f9157s.hashCode() * 31, this.f9158t, 31);
        }

        public final String toString() {
            return s0.l(s0.o("Deeplink(owner=", this.f9157s, ", name=", this.f9158t, ", pullRequestNumber="), this.f9159u, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9157s);
            parcel.writeString(this.f9158t);
            parcel.writeInt(this.f9159u);
        }

        public Deeplink(String str, int i, String str2) {
            k71.k.g(str, "owner");
            k71.k.g(str2, "name");
            this.f9157s = str;
            this.f9158t = str2;
            this.f9159u = i;
        }
    }

    @g81.e
    public static final class History extends CommitsType {

        /* renamed from: s, reason: collision with root package name */
        public final String f9160s;

        /* renamed from: t, reason: collision with root package name */
        public final String f9161t;

        /* renamed from: u, reason: collision with root package name */
        public final String f9162u;

        /* renamed from: v, reason: collision with root package name */
        public final String f9163v;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<History> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitsType$History$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<History> {
            @Override // android.os.Parcelable.Creator
            public final History createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new History(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final History[] newArray(int i) {
                return new History[i];
            }
        }

        public /* synthetic */ History(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                c1.l(i, 15, CommitsType$History$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f9160s = str;
            this.f9161t = str2;
            this.f9162u = str3;
            this.f9163v = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof History)) {
                return false;
            }
            History history = (History) obj;
            return k71.k.b(this.f9160s, history.f9160s) && k71.k.b(this.f9161t, history.f9161t) && k71.k.b(this.f9162u, history.f9162u) && k71.k.b(this.f9163v, history.f9163v);
        }

        public final int hashCode() {
            return this.f9163v.hashCode() + h1.i(h1.i(this.f9160s.hashCode() * 31, this.f9161t, 31), this.f9162u, 31);
        }

        public final String toString() {
            return x.i.k(s0.o("History(owner=", this.f9160s, ", name=", this.f9161t, ", headRefName="), this.f9162u, ", path=", this.f9163v, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9160s);
            parcel.writeString(this.f9161t);
            parcel.writeString(this.f9162u);
            parcel.writeString(this.f9163v);
        }

        public History(String str, String str2, String str3, String str4) {
            k71.k.g(str, "owner");
            k71.k.g(str2, "name");
            k71.k.g(str3, "headRefName");
            k71.k.g(str4, "path");
            this.f9160s = str;
            this.f9161t = str2;
            this.f9162u = str3;
            this.f9163v = str4;
        }
    }

    @g81.e
    public static final class RefComparison extends CommitsType {

        /* renamed from: s, reason: collision with root package name */
        public final String f9164s;

        /* renamed from: t, reason: collision with root package name */
        public final String f9165t;

        /* renamed from: u, reason: collision with root package name */
        public final String f9166u;

        /* renamed from: v, reason: collision with root package name */
        public final String f9167v;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<RefComparison> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitsType$RefComparison$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<RefComparison> {
            @Override // android.os.Parcelable.Creator
            public final RefComparison createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new RefComparison(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RefComparison[] newArray(int i) {
                return new RefComparison[i];
            }
        }

        public /* synthetic */ RefComparison(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                c1.l(i, 15, CommitsType$RefComparison$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f9164s = str;
            this.f9165t = str2;
            this.f9166u = str3;
            this.f9167v = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefComparison)) {
                return false;
            }
            RefComparison refComparison = (RefComparison) obj;
            return k71.k.b(this.f9164s, refComparison.f9164s) && k71.k.b(this.f9165t, refComparison.f9165t) && k71.k.b(this.f9166u, refComparison.f9166u) && k71.k.b(this.f9167v, refComparison.f9167v);
        }

        public final int hashCode() {
            return this.f9167v.hashCode() + h1.i(h1.i(this.f9164s.hashCode() * 31, this.f9165t, 31), this.f9166u, 31);
        }

        public final String toString() {
            return x.i.k(s0.o("RefComparison(owner=", this.f9164s, ", name=", this.f9165t, ", baseRefName="), this.f9166u, ", headRefName=", this.f9167v, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9164s);
            parcel.writeString(this.f9165t);
            parcel.writeString(this.f9166u);
            parcel.writeString(this.f9167v);
        }

        public RefComparison(String str, String str2, String str3, String str4) {
            k71.k.g(str, "owner");
            k71.k.g(str2, "name");
            k71.k.g(str3, "baseRefName");
            k71.k.g(str4, "headRefName");
            this.f9164s = str;
            this.f9165t = str2;
            this.f9166u = str3;
            this.f9167v = str4;
        }
    }
}
