package com.github.rudroid.issueorpullrequest.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.g;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class FilesChangedRoute$$serializer implements d0 {
    public static final int $stable;
    public static final FilesChangedRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FilesChangedRoute$$serializer filesChangedRoute$$serializer = new FilesChangedRoute$$serializer();
        INSTANCE = filesChangedRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.issueorpullrequest.navigation.FilesChangedRoute", filesChangedRoute$$serializer, 5);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        e1Var.l("number", false);
        e1Var.l("isAuthor", true);
        e1Var.l("hasPendingReview", true);
        descriptor = e1Var;
        $stable = 8;
    }

    private FilesChangedRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        g gVar = g.a;
        return new KSerializer[]{q1Var, q1Var, l0.a, gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final FilesChangedRoute m43deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        int i = 0;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        while (z12) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z12 = false;
            } else if (t10 == 0) {
                str = b10.r(serialDescriptor, 0);
                i |= 1;
            } else if (t10 == 1) {
                str2 = b10.r(serialDescriptor, 1);
                i |= 2;
            } else if (t10 == 2) {
                i10 = b10.m(serialDescriptor, 2);
                i |= 4;
            } else if (t10 == 3) {
                z10 = b10.p(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t10 != 4) {
                    throw new UnknownFieldException(t10);
                }
                z11 = b10.p(serialDescriptor, 4);
                i |= 16;
            }
        }
        b10.g(serialDescriptor);
        return new FilesChangedRoute(i, str, str2, i10, z10, z11);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, FilesChangedRoute filesChangedRoute) {
        k.g(encoder, "encoder");
        k.g(filesChangedRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        String str = filesChangedRoute.f15769r;
        boolean z10 = filesChangedRoute.f15773v;
        boolean z11 = filesChangedRoute.f15772u;
        b10.J(serialDescriptor, 0, str);
        b10.J(serialDescriptor, 1, filesChangedRoute.f15770s);
        b10.F(2, filesChangedRoute.f15771t, serialDescriptor);
        if (b10.X(serialDescriptor) || z11) {
            b10.C(serialDescriptor, 3, z11);
        }
        if (b10.X(serialDescriptor) || z10) {
            b10.C(serialDescriptor, 4, z10);
        }
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
