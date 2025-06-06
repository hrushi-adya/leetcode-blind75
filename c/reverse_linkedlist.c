#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* reverseList(struct Node* head) {
    struct Node* curr = head;
    struct Node* prev = NULL;
    struct Node* next;

    while(curr != NULL)  {
        next = curr -> next;
        curr -> next = prev;

        prev = curr;
        curr = next;
    }

    return prev;
}

struct Node* createNode(int newData) {

    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode -> data = newData;
    newNode -> next = NULL;

    return newNode;
}

void printList(struct Node* node) {
    while(node != NULL) {
        printf("%d\t", node-> data);
        node = node -> next;
    }
}

int main(void) {
    
    struct Node* head = createNode(1);
    head -> next = createNode(2);
    head -> next -> next = createNode(3);
    head -> next -> next -> next = createNode(4);
    // 1, 2, 3, 4
    // 4, 3, 2, 1

    printf("LinkedList Data: ");
    printList(head);
    head = reverseList(head);
    printf("Reversed List: ");
    printList(head);
    return 0;
}
