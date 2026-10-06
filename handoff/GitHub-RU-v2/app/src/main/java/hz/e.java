package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$FileReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$RepositoryReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$UnknownReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$WebSearchReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$AgentConfirmation;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$AgentConfirmation$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Complete;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Content;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Debug;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Error;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$FunctionCall;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Unknown;
import com.github.service.dotcom.models.response.copilot.serialization.SkillExecutionResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.WebSearchReferenceResultResponse$$serializer;
import java.lang.annotation.Annotation;
import k81.c1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ e(int i) {
        this.r = i;
    }

    public static final Object a() {
        switch (this.r) {
            case 0:
                ChatMessageReferenceResponse$FileReferenceResponse.Companion companion = ChatMessageReferenceResponse$FileReferenceResponse.Companion;
                return f.Companion.serializer();
            case 1:
                ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion companion2 = ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion;
                return d.Companion.serializer();
            case 2:
                ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion companion3 = ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion;
                return g.Companion.serializer();
            case 3:
                ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion companion4 = ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion;
                return f.Companion.serializer();
            case 4:
                ChatMessageReferenceResponse$UnknownReferenceResponse.Companion companion5 = ChatMessageReferenceResponse$UnknownReferenceResponse.Companion;
                return f.Companion.serializer();
            case 5:
                ChatMessageReferenceResponse$WebSearchReferenceResponse.Companion companion6 = ChatMessageReferenceResponse$WebSearchReferenceResponse.Companion;
                return new k81.d(WebSearchReferenceResultResponse$$serializer.INSTANCE, 0);
            case 6:
                ChatMessageReferenceResponse$WebSearchReferenceResponse.Companion companion7 = ChatMessageReferenceResponse$WebSearchReferenceResponse.Companion;
                return f.Companion.serializer();
            case 7:
                return c1.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceTypeResponse", f.values(), new String[]{"repository", "file", "web-search", "snippet", "github.agent", "unknown"}, new Annotation[][]{null, null, null, null, null, null});
            case 8:
                return c1.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceVisibilityResponse", g.values(), new String[]{"public", "private", "unknown"}, new Annotation[][]{null, null, null});
            case 9:
                ChatMessageResponse.Companion companion8 = ChatMessageResponse.Companion;
                return h.Companion.serializer();
            case 10:
                ChatMessageResponse.Companion companion9 = ChatMessageResponse.Companion;
                return new k81.d(com.github.service.dotcom.models.response.copilot.serialization.b.d, 0);
            case 11:
                ChatMessageResponse.Companion companion10 = ChatMessageResponse.Companion;
                return new k81.d(ChatServerSentEventDataResponse$AgentConfirmation$$serializer.INSTANCE, 0);
            case 12:
                ChatMessageResponse.Companion companion11 = ChatMessageResponse.Companion;
                return new k81.d(ChatClientConfirmationResponse$$serializer.INSTANCE, 0);
            case 13:
                ChatMessageResponse.Companion companion12 = ChatMessageResponse.Companion;
                return new k81.d(SkillExecutionResponse$$serializer.INSTANCE, 0);
            case 14:
                return c1.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageRoleResponse", h.values(), new String[]{"assistant", "user"}, new Annotation[][]{null, null});
            case 15:
                ChatServerSentEventDataResponse$AgentConfirmation.Companion companion13 = ChatServerSentEventDataResponse$AgentConfirmation.Companion;
                return i.Companion.serializer();
            case 16:
                ChatServerSentEventDataResponse$Complete.Companion companion14 = ChatServerSentEventDataResponse$Complete.Companion;
                return i.Companion.serializer();
            case 17:
                ChatServerSentEventDataResponse$Complete.Companion companion15 = ChatServerSentEventDataResponse$Complete.Companion;
                return new k81.d(com.github.service.dotcom.models.response.copilot.serialization.b.d, 0);
            case 18:
                ChatServerSentEventDataResponse$Complete.Companion companion16 = ChatServerSentEventDataResponse$Complete.Companion;
                return h.Companion.serializer();
            case 19:
                ChatServerSentEventDataResponse$Content.Companion companion17 = ChatServerSentEventDataResponse$Content.Companion;
                return i.Companion.serializer();
            case 20:
                ChatServerSentEventDataResponse$Debug.Companion companion18 = ChatServerSentEventDataResponse$Debug.Companion;
                return i.Companion.serializer();
            case 21:
                ChatServerSentEventDataResponse$Error.Companion companion19 = ChatServerSentEventDataResponse$Error.Companion;
                return i.Companion.serializer();
            case 22:
                ChatServerSentEventDataResponse$Error.Companion companion20 = ChatServerSentEventDataResponse$Error.Companion;
                return j.Companion.serializer();
            case 23:
                ChatServerSentEventDataResponse$FunctionCall.Companion companion21 = ChatServerSentEventDataResponse$FunctionCall.Companion;
                return i.Companion.serializer();
            case 24:
                ChatServerSentEventDataResponse$FunctionCall.Companion companion22 = ChatServerSentEventDataResponse$FunctionCall.Companion;
                return m.Companion.serializer();
            case 25:
                ChatServerSentEventDataResponse$FunctionCall.Companion companion23 = ChatServerSentEventDataResponse$FunctionCall.Companion;
                return l.Companion.serializer();
            case 26:
                ChatServerSentEventDataResponse$FunctionCall.Companion companion24 = ChatServerSentEventDataResponse$FunctionCall.Companion;
                return new k81.d(com.github.service.dotcom.models.response.copilot.serialization.b.d, 0);
            case 27:
                ChatServerSentEventDataResponse$Unknown.Companion companion25 = ChatServerSentEventDataResponse$Unknown.Companion;
                return i.Companion.serializer();
            case 28:
                return c1.e("com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataTypeResponse", i.values(), new String[]{"debug", "confirmation", "functionCall", "content", "complete", "error", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null});
            default:
                return c1.e("com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventErrorTypeResponse", j.values(), new String[]{"exception", "rateLimit", "unknown"}, new Annotation[][]{null, null, null});
        }
    }
    public Object a(Object p1) { return null; }
    public static Object c(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
