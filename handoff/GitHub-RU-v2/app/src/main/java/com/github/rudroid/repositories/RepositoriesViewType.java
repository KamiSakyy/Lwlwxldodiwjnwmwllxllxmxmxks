package com.github.rudroid.repositories;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.KSerializer;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public abstract class RepositoriesViewType implements Parcelable {
    public static final Companion Companion = new Companion();

    /* renamed from: s, reason: collision with root package name */
    public static final Object f18965s = sy.w.s(w61.i.r, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(13));

    /* renamed from: r, reason: collision with root package name */
    public int f18966r;

    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) RepositoriesViewType.f18965s.getValue();
        }
    }

    @g81.e
    public static final class Forked extends RepositoriesViewType {
        public static final Forked INSTANCE = new Forked(2131953523);
        public static final Parcelable.Creator<Forked> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ Object f18967t = sy.w.s(w61.i.r, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(14));

        public static final class a implements Parcelable.Creator<Forked> {
            @Override // android.os.Parcelable.Creator
            public final Forked createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return Forked.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Forked[] newArray(int i) {
                return new Forked[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Forked);
        }

        public final int hashCode() {
            return 2056111615;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) f18967t.getValue();
        }

        public final String toString() {
            return "Forked";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @g81.e
    public static final class Repositories extends RepositoriesViewType {
        public static final Repositories INSTANCE = new Repositories(2131953517);
        public static final Parcelable.Creator<Repositories> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ Object f18968t = sy.w.s(w61.i.r, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(15));

        public static final class a implements Parcelable.Creator<Repositories> {
            @Override // android.os.Parcelable.Creator
            public final Repositories createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return Repositories.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Repositories[] newArray(int i) {
                return new Repositories[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Repositories);
        }

        public final int hashCode() {
            return -256767994;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) f18968t.getValue();
        }

        public final String toString() {
            return "Repositories";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public RepositoriesViewType(int i) {
        this.f18966r = i;
    }
}
