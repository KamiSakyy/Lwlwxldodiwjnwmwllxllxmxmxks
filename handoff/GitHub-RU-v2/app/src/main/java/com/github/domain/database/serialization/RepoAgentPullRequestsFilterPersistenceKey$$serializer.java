package com.github.domain.database.serialization;

import com.github.domain.database.serialization.RepoAgentPullRequestsFilterPersistenceKey;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
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
public final /* synthetic */ class RepoAgentPullRequestsFilterPersistenceKey$$serializer implements d0 {
    public static final RepoAgentPullRequestsFilterPersistenceKey$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepoAgentPullRequestsFilterPersistenceKey$$serializer repoAgentPullRequestsFilterPersistenceKey$$serializer = new RepoAgentPullRequestsFilterPersistenceKey$$serializer();
        INSTANCE = repoAgentPullRequestsFilterPersistenceKey$$serializer;
        e1 e1Var = new e1("RepoAgent_PullRequests", repoAgentPullRequestsFilterPersistenceKey$$serializer, 3);
        e1Var.l("key", false);
        e1Var.l("ownerName", false);
        e1Var.l("repoName", false);
        descriptor = e1Var;
    }

    private RepoAgentPullRequestsFilterPersistenceKey$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepoAgentPullRequestsFilterPersistenceKey m8deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new RepoAgentPullRequestsFilterPersistenceKey(i, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepoAgentPullRequestsFilterPersistenceKey repoAgentPullRequestsFilterPersistenceKey) {
        k.g(encoder, "encoder");
        k.g(repoAgentPullRequestsFilterPersistenceKey, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        RepoAgentPullRequestsFilterPersistenceKey.Companion companion = RepoAgentPullRequestsFilterPersistenceKey.Companion;
        b.J(serialDescriptor, 0, repoAgentPullRequestsFilterPersistenceKey.r);
        b.J(serialDescriptor, 1, repoAgentPullRequestsFilterPersistenceKey.t);
        b.J(serialDescriptor, 2, repoAgentPullRequestsFilterPersistenceKey.u);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
