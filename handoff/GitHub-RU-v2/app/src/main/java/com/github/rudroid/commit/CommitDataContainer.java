package com.github.rudroid.commit;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public abstract class CommitDataContainer implements Parcelable {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f9043r = sy.w.s(w61.i.r, new com.github.rudroid.agents.p(26));

    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) CommitDataContainer.f9043r.getValue();
        }
    }

    @g81.e
    public static final class CommitFromId extends CommitDataContainer {

        /* renamed from: s, reason: collision with root package name */
        public String f9044s;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<CommitFromId> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitDataContainer$CommitFromId$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<CommitFromId> {
            @Override // android.os.Parcelable.Creator
            public final CommitFromId createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new CommitFromId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommitFromId[] newArray(int i) {
                return new CommitFromId[i];
            }
        }

        public CommitFromId(String str) {
            k71.k.g(str, "commitId");
            this.f9044s = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommitFromId) && k71.k.b(this.f9044s, ((CommitFromId) obj).f9044s);
        }

        public final int hashCode() {
            return this.f9044s.hashCode();
        }

        public final String toString() {
            return f1.e.z("CommitFromId(commitId=", this.f9044s, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9044s);
        }

        public /* synthetic */ CommitFromId(String str, int i) {
            if (1 == (i & 1)) {
                this.f9044s = str;
            } else {
                c1Shadow.l(i, 1, CommitDataContainer$CommitFromId$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }

    @g81.e
    public static final class CommitFromRepoData extends CommitDataContainer {

        /* renamed from: s, reason: collision with root package name */
        public String f9045s;

        /* renamed from: t, reason: collision with root package name */
        public String f9046t;

        /* renamed from: u, reason: collision with root package name */
        public String f9047u;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<CommitFromRepoData> CREATOR = new a();

        public static final class Companion {
            public final KSerializer serializer() {
                return CommitDataContainer$CommitFromRepoData$$serializer.INSTANCE;
            }
        }

        public static final class a implements Parcelable.Creator<CommitFromRepoData> {
            @Override // android.os.Parcelable.Creator
            public final CommitFromRepoData createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (readString3 == null) {
                    readString3 = "";
                }
                return new CommitFromRepoData(readString, readString2, readString3);
            }

            @Override // android.os.Parcelable.Creator
            public final CommitFromRepoData[] newArray(int i) {
                return new CommitFromRepoData[i];
            }
        }

        public CommitFromRepoData(String str, String str2, String str3) {
            k71.k.g(str, "repositoryOwner");
            k71.k.g(str2, "repositoryName");
            k71.k.g(str3, "commitOid");
            this.f9045s = str;
            this.f9046t = str2;
            this.f9047u = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommitFromRepoData)) {
                return false;
            }
            CommitFromRepoData commitFromRepoData = (CommitFromRepoData) obj;
            return k71.k.b(this.f9045s, commitFromRepoData.f9045s) && k71.k.b(this.f9046t, commitFromRepoData.f9046t) && k71.k.b(this.f9047u, commitFromRepoData.f9047u);
        }

        public final int hashCode() {
            return this.f9047u.hashCode() + h1.i(this.f9045s.hashCode() * 31, this.f9046t, 31);
        }

        public final String toString() {
            return h1.p(a0.s0.o("CommitFromRepoData(repositoryOwner=", this.f9045s, ", repositoryName=", this.f9046t, ", commitOid="), qb.a.a(this.f9047u), ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f9045s);
            parcel.writeString(this.f9046t);
            String str = this.f9047u;
            k71.k.g(str, "$v$c$com-github-android-common-datatypes-CommitOid$-$this$write$0");
            parcel.writeString(str);
        }

        public /* synthetic */ CommitFromRepoData(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                c1Shadow.l(i, 7, CommitDataContainer$CommitFromRepoData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f9045s = str;
            this.f9046t = str2;
            this.f9047u = str3;
        }
    }
}
