package structure;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node<Item> {
    private Item item;
    private Node<Item> next;
}
