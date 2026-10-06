package com.github.domain.database.serialization;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryPullRequestsFilterPersistenceKey extends b {
    public final String t;
    public final String u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryPullRequestsFilterPersistenceKey> CREATOR = new f8.a(13);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryPullRequestsFilterPersistenceKey$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositoryPullRequestsFilterPersistenceKey(int i, String str, String str2, String str3) {
        super(str);
        if (7 != (i & 7)) {
            c1.l(i, 7, RepositoryPullRequestsFilterPersistenceKey$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = str2;
        this.u = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryPullRequestsFilterPersistenceKey(String str, String str2) {
        super(no.a.q(new StringBuilder("Repository_PullRequests::"), str, "/", str2), 0);
        k.g(str, "ownerName");
        k.g(str2, "repoName");
        this.t = str;
        this.u = str2;
    }
}
