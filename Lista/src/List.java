public class List
{
    private int[] vectorOfElements;
    private int numberOfElements;

    public List(int size)
    {
        vectorOfElements = new int[size];
        numberOfElements = 0;
    }

    public int getNumberOfElements()
    {
        return numberOfElements;
    }

    public boolean isEmpty()
    {
        return numberOfElements == 0;
    }

    public boolean isFull()
    {
        return numberOfElements >= vectorOfElements.length;
    }

    public int getElement(int index)
    {
        return vectorOfElements[index];
    }

    public void setElement(int element, int index)
    {
        vectorOfElements[index] = element;
    }

    public void addStart(int element)
    {
        if(isFull())
        {
            System.out.println("List is full!");
        } else {
            for(int index = numberOfElements; index > 0; index--)
            {
                vectorOfElements[index] = vectorOfElements[index -1];
            }

            vectorOfElements[0] = element;
            numberOfElements    = numberOfElements + 1;
        }
    }

    public int removeStart()
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return -1;
        } else {
            int elementRemoved = vectorOfElements[0];

            for(int index = 1; index <= numberOfElements -1; index++)
            {
                vectorOfElements[index - 1] = vectorOfElements[index];
            }

            numberOfElements = numberOfElements - 1;
            return elementRemoved;
        }
    }

    public void addEnd(int element)
    {
        if(isFull())
        {
            System.out.println("List is full!");
        } else {
            int index = numberOfElements;

            vectorOfElements[index] = element;
            numberOfElements        = numberOfElements + 1;
        }
    }

    public int removeEnd()
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return -1;
        } else {
            int index           = numberOfElements - 1;
            int elementRemoved  = vectorOfElements[index];

            numberOfElements = index;
            return elementRemoved;
        }
    }
    public void addPosition(int element, int position)
    {
        if(isFull())
        {
            System.out.println("List is full!");
        } else if (position <= 0)
        {
            addStart(element);
        } else if(position >= numberOfElements)
        {
            addEnd(element);
        } else {
            for(int index = numberOfElements; index > position; index--)
            {
                vectorOfElements[index] = vectorOfElements[index - 1];
            }

            vectorOfElements[position] = element;
            numberOfElements = numberOfElements + 1;
        }
    }

    public  int removePosition(int position)
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return -1;
        } else if (position <= 0)
        {
           return removeStart();
        } else if(position >= numberOfElements)
        {
            return removeEnd();
        } else {
            int elementRemoved = vectorOfElements[position];

            for(int index = position; index <= numberOfElements - 1; index++)
            {
                vectorOfElements[index - 1] = vectorOfElements[index];
            }

            numberOfElements = numberOfElements - 1;
            return elementRemoved;
        }
    }
}
