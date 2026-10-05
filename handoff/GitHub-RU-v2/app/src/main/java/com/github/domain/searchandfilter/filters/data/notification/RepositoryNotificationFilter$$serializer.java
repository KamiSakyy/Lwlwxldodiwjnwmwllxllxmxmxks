package com.github.domain.searchandfilter.filters.data.notification;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.Avatar$;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class RepositoryNotificationFilter$$serializer implements d0 {
    public static final RepositoryNotificationFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoryNotificationFilter$$serializer repositoryNotificationFilter$$serializer = new RepositoryNotificationFilter$$serializer();
        INSTANCE = repositoryNotificationFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter", repositoryNotificationFilter$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("queryString", false);
        e1Var.l("nameWithOwner", false);
        e1Var.l("avatar", false);
        e1Var.l("count", false);
        descriptor = e1Var;
    }

    private RepositoryNotificationFilter$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, Avatar$.serializer.INSTANCE, l0.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoryNotificationFilter m67deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        Avatar avatar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                avatar = (Avatar) b.A(serialDescriptor, 3, Avatar$.serializer.INSTANCE, avatar);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                i2 = b.m(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new RepositoryNotificationFilter(i, i2, avatar, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoryNotificationFilter repositoryNotificationFilter) {
        k.g(encoder, "encoder");
        k.g(repositoryNotificationFilter, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, repositoryNotificationFilter.s);
        b.J(serialDescriptor, 1, repositoryNotificationFilter.t);
        b.J(serialDescriptor, 2, repositoryNotificationFilter.u);
        b.I(serialDescriptor, 3, Avatar$.serializer.INSTANCE, repositoryNotificationFilter.v);
        b.F(4, repositoryNotificationFilter.w, serialDescriptor);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
