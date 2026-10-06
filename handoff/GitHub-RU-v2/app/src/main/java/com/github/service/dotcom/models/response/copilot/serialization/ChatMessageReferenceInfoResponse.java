package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageReferenceInfoResponse {
    public static final Companion Companion = new Companion();
    public static final ChatMessageReferenceInfoResponse c = new ChatMessageReferenceInfoResponse("", "");
    public String a;
    public String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageReferenceInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatMessageReferenceInfoResponse(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageReferenceInfoResponse)) {
            return false;
        }
        ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse = (ChatMessageReferenceInfoResponse) obj;
        return k.b(this.a, chatMessageReferenceInfoResponse.a) && k.b(this.b, chatMessageReferenceInfoResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("ChatMessageReferenceInfoResponse(name=", this.a, ", type=", this.b, ")");
    }

    public ChatMessageReferenceInfoResponse(String str, String str2) {
        k.g(str, "name");
        k.g(str2, "type");
        this.a = str;
        this.b = str2;
    }
}
