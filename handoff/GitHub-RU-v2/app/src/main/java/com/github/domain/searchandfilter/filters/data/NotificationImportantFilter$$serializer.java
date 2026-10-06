package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
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
public final /* synthetic */ class NotificationImportantFilter$$serializer implements d0 {
    public static final NotificationImportantFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NotificationImportantFilter$$serializer notificationImportantFilter$$serializer = new NotificationImportantFilter$$serializer();
        INSTANCE = notificationImportantFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.NotificationImportantFilter", notificationImportantFilter$$serializer, 4);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("active", true);
        e1Var.l("isNew", true);
        descriptor = e1Var;
    }

    private NotificationImportantFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        k81.g gVar = k81.g.a;
        return new KSerializer[]{NotificationImportantFilter.x[0].getValue(), q1.a, gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final NotificationImportantFilter m42deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = NotificationImportantFilter.x;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        l lVar = null;
        String str = null;
        boolean z3 = true;
        while (z3) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z3 = false;
            } else if (t == 0) {
                lVar = (l) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), lVar);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                z = b.p(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                z2 = b.p(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new NotificationImportantFilter(i, lVar, str, z, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, NotificationImportantFilter notificationImportantFilter) {
        k.g(encoder, "encoder");
        k.g(notificationImportantFilter, "value");
        boolean z = notificationImportantFilter.w;
        boolean z2 = notificationImportantFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        NotificationImportantFilter.Companion companion = NotificationImportantFilter.Companion;
        d.y(notificationImportantFilter, b, serialDescriptor);
        if (b.X(serialDescriptor) || z2) {
            b.C(serialDescriptor, 2, z2);
        }
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 3, z);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
