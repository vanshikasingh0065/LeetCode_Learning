class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}

        for num in nums:
            map[num] = map.get(num,0)+1

        bucket =[]

        for i in range(len(nums)+1):
            bucket.append([])

        for key,val in map.items():
                bucket[val].append(key)
                #putting the keys into the bucket of thier specific count
                #https://www.youtube.com/watch?v=EBNPu0GgM64&ab_channel=NikhilLohia

        res =[]
        for curr in bucket[::-1]:
            if not curr:
                continue
            else:
                for num in curr:
                    if k>0:
                        res.append(num)
                        k-=1
                    else:
                        break
        return res
