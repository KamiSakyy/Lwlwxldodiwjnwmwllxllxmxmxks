package com.github.domain.discussions.data;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class DiscussionCategoryData$$serializer implements d0 {
    public static final DiscussionCategoryData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DiscussionCategoryData$$serializer discussionCategoryData$$serializer = new DiscussionCategoryData$$serializer();
        INSTANCE = discussionCategoryData$$serializer;
        e1 e1Var = new e1("com.github.domain.discussions.data.DiscussionCategoryData", discussionCategoryData$$serializer, 7);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("emojiHTML", false);
        e1Var.l("isAnswerable", false);
        e1Var.l("isPollable", false);
        e1Var.l("description", false);
        e1Var.l("formTemplateUrl", false);
        descriptor = e1Var;
    }

    private DiscussionCategoryData$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        KSerializer z = a.z(kSerializer);
        g gVar = g.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, gVar, gVar, kSerializer, z};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final DiscussionCategoryData m17deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z3 = true;
        while (z3) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z = b.p(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.p(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.r(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.x(serialDescriptor, 6, q1.a, str5);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new DiscussionCategoryData(i, str, str2, str3, z, z2, str4, str5);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, DiscussionCategoryData discussionCategoryData) {
        k.g(encoder, "encoder");
        k.g(discussionCategoryData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, discussionCategoryData.r);
        b.J(serialDescriptor, 1, discussionCategoryData.s);
        b.J(serialDescriptor, 2, discussionCategoryData.t);
        b.C(serialDescriptor, 3, discussionCategoryData.u);
        b.C(serialDescriptor, 4, discussionCategoryData.v);
        b.J(serialDescriptor, 5, discussionCategoryData.w);
        b.H(serialDescriptor, 6, q1.a, discussionCategoryData.x);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
