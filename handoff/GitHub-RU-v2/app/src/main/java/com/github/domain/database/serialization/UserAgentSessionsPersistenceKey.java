package com.github.domain.database.serialization;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class UserAgentSessionsPersistenceKey extends b {
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UserAgentSessionsPersistenceKey> CREATOR = new f8.a(17);

    public static final class Companion {
        public final KSerializer serializer() {
            return UserAgentSessionsPersistenceKey$$serializer.INSTANCE;
        }
    }

    public UserAgentSessionsPersistenceKey() {
        super("User_Agent_Sessions", 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}
