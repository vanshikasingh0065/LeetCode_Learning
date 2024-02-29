/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& l) {
        
        auto comp = [](ListNode* lhs, ListNode* rhs) {
            return lhs->val > rhs->val;
        };
        
        priority_queue<ListNode* , vector<ListNode*>, decltype(comp)> myq(comp);
        
        
        ListNode* dummy = new ListNode(0);
        
        ListNode* curr = dummy;
        
        for(auto &k:l) {
            if(k)
                myq.push(k);
        }
        
        while(!myq.empty()) {
            
            auto t = myq.top();
            myq.pop();
            
            curr->next = t;
            t = t->next;
            curr = curr->next;
            if(t) {
                myq.push(t);
            }
            
        }
        
        ListNode* res = dummy->next;
        
        delete dummy;
        
        return res;
        
        
    }
};