package com.github.domain.database.serialization;

import com.github.domain.database.serialization.UserOrOrgRepositoriesFilterPersistenceKey;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class UserOrOrgRepositoriesFilterPersistenceKey$$serializer implements d0 {
    public static final UserOrOrgRepositoriesFilterPersistenceKey$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserOrOrgRepositoriesFilterPersistenceKey$$serializer userOrOrgRepositoriesFilterPersistenceKey$$serializer = new UserOrOrgRepositoriesFilterPersistenceKey$$serializer();
        INSTANCE = userOrOrgRepositoriesFilterPersistenceKey$$serializer;
        e1 e1Var = new e1("UserOrOrg_Repositories", userOrOrgRepositoriesFilterPersistenceKey$$serializer, 2);
        e1Var.l("key", false);
        e1Var.l("login", false);
        descriptor = e1Var;
    }

    private UserOrOrgRepositoriesFilterPersistenceKey$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final UserOrOrgRepositoriesFilterPersistenceKey m16deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new UserOrOrgRepositoriesFilterPersistenceKey(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, UserOrOrgRepositoriesFilterPersistenceKey userOrOrgRepositoriesFilterPersistenceKey) {
        k.g(encoder, "encoder");
        k.g(userOrOrgRepositoriesFilterPersistenceKey, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        UserOrOrgRepositoriesFilterPersistenceKey.Companion companion = UserOrOrgRepositoriesFilterPersistenceKey.Companion;
        b.J(serialDescriptor, 0, userOrOrgRepositoriesFilterPersistenceKey.r);
        b.J(serialDescriptor, 1, userOrOrgRepositoriesFilterPersistenceKey.t);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
