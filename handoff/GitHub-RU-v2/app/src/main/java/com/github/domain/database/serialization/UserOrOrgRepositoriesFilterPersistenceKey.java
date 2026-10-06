package com.github.domain.database.serialization;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class UserOrOrgRepositoriesFilterPersistenceKey extends b {
    public String t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UserOrOrgRepositoriesFilterPersistenceKey> CREATOR = new f8.a(18);

    public static final class Companion {
        public final KSerializer serializer() {
            return UserOrOrgRepositoriesFilterPersistenceKey$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserOrOrgRepositoriesFilterPersistenceKey(String str, int i, String str2) {
        super(str);
        if (3 != (i & 3)) {
            c1.l(i, 3, UserOrOrgRepositoriesFilterPersistenceKey$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserOrOrgRepositoriesFilterPersistenceKey(String str) {
        super("UserOrOrg_Repositories:".concat(str), 0);
        k.g(str, "login");
        this.t = str;
    }
}
